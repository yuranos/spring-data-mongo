package com.yuranos.session;

import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.StringUtils;

import java.security.InvalidParameterException;
import java.util.Calendar;
import java.util.Date;


@Document(collection = "session")
public class Session {
    @Id
    private String id;
    //field named temporarily as _basket to provide backwards compatibility, to be renamed to basket and migrated soon.
    @SuppressWarnings("squid:S00116")
    private DBObject _basket;
    private Date date;
    private String updatedBy;
    private String basketVersion;

    public Session(String id, String basket, String basketVersion) {
        super();
        this.id = id;
        this._basket = (DBObject) JSON.parse(basket);
        this.date = Calendar.getInstance().getTime();
        this.basketVersion = basketVersion;
    }

    @PersistenceConstructor
    public Session(String id, DBObject _basket, String basketVersion) {
        super();
        this.id = id;
        this._basket = _basket;
        this.date = Calendar.getInstance().getTime();
        this.basketVersion = basketVersion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Transient
    public String getBasket() {
        return _basket != null ? _basket.toString() : null;
    }

    @Transient
    public void setBasket(String basket) {
        if (StringUtils.isEmpty(basket)) {
            throw new InvalidParameterException("Empty or null basket");
        }
        this._basket = (DBObject) JSON.parse(basket);
    }

    public Date getDate() {
        return new Date(date.getTime());
    }

    public void setDate(Date date) {
        this.date = new Date(date.getTime());
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getBasketVersion() {
        return basketVersion;
    }

    public void setBasketVersion(String basketVersion) {
        this.basketVersion = basketVersion;
    }

    public DBObject get_basket() {
        return _basket;
    }
}
