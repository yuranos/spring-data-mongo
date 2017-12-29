package com.yuranos;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yuranos.customer.model.Customer;
import com.yuranos.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
//        (scanBasePackages = "com.yuranos.session")
public class Application implements CommandLineRunner {

    @Autowired
    private CustomerRepository repository;

    @Autowired
    MongoTemplate mongoTemplate;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... names) throws Exception {

//		repository.deleteAll();

//         save a couple of customers
//		repository.save(new Customer("Alice", "Smith"));
//		repository.save(new Customer("Bob", "Smith"));
//
//		Customer alice = repository.findByFirstName("Alice");
//		alice.lastName = "From IDEA";
//		Customer newAlice = repository.save(alice);
//        System.out.println(newAlice);


		// fetch all customers
//		System.out.println("Customers found with findAll():");
//		System.out.println("-------------------------------");
//		for (Customer com.yuranos.customer : repository.findAll()) {
//			System.out.println(com.yuranos.customer);
//		}
//		System.out.println();
//
//		// fetch an individual com.yuranos.customer
//		System.out.println("Customer found with findByFirstName('Alice'):");
//		System.out.println("--------------------------------");
//		System.out.println(repository.findByFirstName("Alice"));
//
//		System.out.println("Customers found with findByLastName('Smith'):");
//		System.out.println("--------------------------------");
//		for (Customer com.yuranos.customer : repository.findByLastName("Smith")) {
//			System.out.println(com.yuranos.customer);
//		}
//


        //BEGIN findAndModify test
//        Query query = new Query();
//        query.addCriteria(Criteria.where("firstName").is("heyhey"));
//
//        Update update = new Update();
//        update.set("lastName", names[1]);
//
////FindAndModifyOptions().returnNew(true) = newly updated document
////FindAndModifyOptions().returnNew(false) = old document (not update yet)
//        Customer myCustomer = mongoTemplate.findAndModify(
//                query, update, Customer.class);
//        List<Customer> customers = mongoTemplate.find(query, Customer.class);
//        System.out.println(myCustomer);
//END findAndModify test
    }


    @Bean
    public ObjectMapper getObjectMapper(){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper;
    }

}
