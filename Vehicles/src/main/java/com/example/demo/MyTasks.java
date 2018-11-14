package com.example.demo;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MyTasks {

    RestTemplate restTemplate = new RestTemplate();


//    @Scheduled(cron = "*/5 * * * * *")
//    public Vehicle addVehicle() {
//        int id = RandomUtils.nextInt(1,100);
//        String makeModel = RandomStringUtils.randomAlphabetic(10);
//        int year = RandomUtils.nextInt(1986,2016);
//        double price = RandomUtils.nextLong(15000,45000);
//        Vehicle v1 = new Vehicle(id,makeModel,year,price);
//        String postUrl = "http://localhost:3306/addVehicle";
//        restTemplate.postForObject(postUrl, v1, Vehicle.class);
//
//        System.out.println("Hello");
//        return v1;
//
//    }

//    @Scheduled(cron = "*/5 * * * * *")
//    public void getVehicle() {
//        int id = RandomUtils.nextInt(0,5);
//        String getUrl = "http://localhost:8080/getVehicle/" + id;
//        Vehicle v = restTemplate.getForObject(getUrl, Vehicle.class);
//        assert v != null;
//        System.out.println(v.getContent());
//    }
//
//    @Scheduled(cron = "*/5 * * * * *")
//    public void deleteVehicle() throws Exception {
//        int id = RandomUtils.nextInt(0, 15);
//        String deleteUrl = "http://localhost:8080/deleteVehicle/" + id;
//        restTemplate.delete(deleteUrl,Vehicle.class);
//    }
//
//    @Scheduled(cron = "*/5 * * * * *")
//    public void updateVehicle() throws Exception {
//
//    }


}
