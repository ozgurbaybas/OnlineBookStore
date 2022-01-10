package ozgurbaybas.OnlineBookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ozgurbaybas.OnlineBookStore.service.IUserService;

@RestController
@RequestMapping("api/internal") //pre-path
public class InternalApiController
{
    @Autowired
    private IUserService userService;

    @PutMapping("make-admim/{username}")  //api/internal/make-admim/{username}
    public ResponseEntity<?> makeAdmin(@PathVariable String username)
    {
        userService.makeAdmin(username);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}