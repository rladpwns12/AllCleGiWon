package allclegiwon.common;

import allclegiwon.CourseApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CourseApplication.class })
public class CucumberSpingConfiguration {}
