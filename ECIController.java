package ECIController;

import com.grp17.firstwebsite.FirstwebsiteApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// Request body POJO class to accept numbers
class AdditionRequest {
    private int num1;
    private int num2;

    // Getters and setters
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}

@RestController
public class ECIController {

    @GetMapping("/add")
    public String addTwoNumbers(int num1, int num2) {
        return FirstwebsiteApplication.addTwo(num1, num2);
    }

    // POST method for /add endpoint
    @PostMapping("/add")
    public String addTwoNumbersPost(@RequestBody AdditionRequest request) {
        return FirstwebsiteApplication.addTwo(request.getNum1(), request.getNum2());
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
