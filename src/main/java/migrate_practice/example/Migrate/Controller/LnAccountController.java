package migrate_practice.example.Migrate.Controller;

import migrate_practice.example.Migrate.Entity.LnAccount;
import migrate_practice.example.Migrate.Service.LnAccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/lnaccount")
public class LnAccountController {
    private final LnAccountService lnAccountService;

    public LnAccountController(LnAccountService lnAccountService) {
        this.lnAccountService = lnAccountService;
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}

