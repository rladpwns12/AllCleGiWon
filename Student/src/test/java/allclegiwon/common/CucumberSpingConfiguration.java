package allclegiwon.common;

import allclegiwon.StudentApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { StudentApplication.class })
public class CucumberSpingConfiguration {}
