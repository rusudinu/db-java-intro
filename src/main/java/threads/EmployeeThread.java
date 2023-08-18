package threads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeThread extends Thread {
    int no;

    @Override
    public void run() {
        System.out.println("EmployeeRunnable " + no + " is running");
    }
}
