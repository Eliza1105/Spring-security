package org.itstep;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @PreAuthorize("hasAutority('write')")
@GetMapping("/root")
    public String root(){
    return "root";
}

    @PreAuthorize("hasAutority('write','user')")
    @GetMapping("/user")
    public String user(){
        return "user";
    }
}
