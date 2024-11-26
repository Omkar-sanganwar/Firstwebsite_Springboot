package ECIController;

import com.grp17.firstwebsite.FirstwebsiteApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ECIController {

    @GetMapping("/add")
    public String addTwoNumbers(int num1, int num2) {
        return FirstwebsiteApplication.addTwo(num1, num2);
    }

    @GetMapping("/subtract")
    public String subtractTwoNumbers(int num1, int num2) {
        return FirstwebsiteApplication.subtractTwo(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiplyTwoNumbers(int num1, int num2) {
        return FirstwebsiteApplication.multiplyTwo(num1, num2);
    }

    @GetMapping("/divide")
    public String divideTwoNumbers(int num1, int num2) {
        return FirstwebsiteApplication.divideTwo(num1, num2);
    }

    @GetMapping("/remainder")
    public String remainderOfDivision(int num1, int num2) {
        return FirstwebsiteApplication.findRemainder(num1, num2);
    }

    @GetMapping("/square")
    public String findSquare(int num) {
        return FirstwebsiteApplication.square(num);
    }

    @GetMapping("/cube")
    public String findCube(int num) {
        return FirstwebsiteApplication.cube(num);
    }

    @GetMapping("/isEven")
    public String checkIfEven(int num) {
        return FirstwebsiteApplication.isEven(num);
    }

    @GetMapping("/factorial")
    public String findFactorial(int num) {
        return FirstwebsiteApplication.factorial(num);
    }

    @GetMapping("/power")
    public String findPower(int base, int exp) {
        return FirstwebsiteApplication.power(base, exp);
    }
}
