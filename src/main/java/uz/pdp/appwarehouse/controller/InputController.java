package uz.pdp.appwarehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.pdp.appwarehouse.entity.Input;
import uz.pdp.appwarehouse.payload.InputDto;
import uz.pdp.appwarehouse.payload.Result;
import uz.pdp.appwarehouse.service.InputService;

import java.util.List;

@RestController
@RequestMapping("/input")
public class InputController {
    @Autowired
    InputService inputService;

    @PostMapping("/add")
    public Result add(@RequestBody InputDto inputDto){
        Result result = inputService.add(inputDto);
        return result;
    }

    @GetMapping("/getALl")
    public List<Input> getAll(){
        List<Input> allInputs = inputService.getAll();
        return allInputs;
    }

    @PutMapping("/update/{id}")
    public Result update(@PathVariable Integer id, @RequestBody InputDto inputDto){
        Result result = inputService.update(id, inputDto);
        return result;
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        Result result = inputService.delete(id);
        return result;
    }
}
