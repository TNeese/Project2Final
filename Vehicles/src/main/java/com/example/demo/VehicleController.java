package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {

    private final VehiclesDao vehiclesDao;



    @Autowired
    public VehicleController(VehiclesDao vehiclesDao) {
        this.vehiclesDao = vehiclesDao;
    }


    @RequestMapping(value = "/addVehicle", method = RequestMethod.POST)
    public Vehicle addVehicle(@RequestBody Vehicle newVehicle) {
        vehiclesDao.create(newVehicle);
        return newVehicle;
    }



    @RequestMapping(value = "/getVehicle/{id}", method = RequestMethod.GET)
    public Vehicle getVehicle(@PathVariable("id") int id) {
        return vehiclesDao.getById(id);
    }


    @RequestMapping(value = "/updateVehicle", method = RequestMethod.PUT)
    public void updateVehicle(@RequestBody Vehicle newVehicle) {
        vehiclesDao.update(newVehicle);
    }


    @RequestMapping(value = "/deleteVehicle/{id}", method = RequestMethod.DELETE)
    public void deleteVehicle(@PathVariable("id") int id) {
        vehiclesDao.delete(id);
    }


    @RequestMapping(value = "/getLatestVehicles", method = RequestMethod.GET)
    public List getLatestVehicles() {
        return vehiclesDao.getLatest();
    }

}
