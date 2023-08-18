package threads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRunnable implements Runnable {
    int no;

    public void run() {
        System.out.println("EmployeeRunnable " + no + " is running");
    }
}
