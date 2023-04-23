package jd.cloud.mall.user.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jd.cloud.mall.common.common.ApiRestResponse;
import jd.cloud.mall.user.model.request.RegisterRequest;
import jd.cloud.mall.user.service.UserService;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/test")
    public ApiRestResponse test(@RequestParam("test") @Min(12) Integer test
                       ) {

        return ApiRestResponse.success();
    }

    @GetMapping("/test2")
    public String test2() {
        return "test successful";
    }

    // Register

    @PostMapping("/register")
    public ApiRestResponse register( @Valid @RequestBody RegisterRequest registerRequest,
                                    BindingResult bindingResult
    ){
        List<ObjectError> allErrors = bindingResult.getAllErrors();


        return ApiRestResponse.success(allErrors.toString());

    }

    // Login


    // Logout


    // register
//    @PostMapping("/register")
//    @ResponseBody
//    public ApiRestResponse register(@RequestParam("userName") String userName,
//                                    @RequestParam("password") String password,
//                                    @RequestParam("emailAdress") String emailAddress,
//                                    @RequestParam("verificationCode")String verificationCode) throws imoocMallException, NoSuchAlgorithmException {
//
//}



//    @PostMapping("/user/update")
//    @ResponseBody
//    public ApiRestResponse updateUserInfo(HttpSession session, @RequestParam String signature) throws imoocMallException {}


    //    @PostMapping("/adminLogin")
    //    @ResponseBody


    //     @PostMapping("/user/sendEmail")
    //    @ResponseBody
    //    public  ApiRestResponse sendEmail(@RequestParam("emailAddress") String emailAddress){}


//
}