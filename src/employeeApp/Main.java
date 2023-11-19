package employeeApp;

import employeeApp.enums.Plan;
import employeeApp.model.Employee;
import employeeApp.model.HealthPlan;

import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        HealthPlan plan1 = new HealthPlan(1,"A Insurance", Plan.ADVANCE);
        HealthPlan plan2 = new HealthPlan(2,"B Insurance", Plan.MEDIUM);

        String[] healthPlans = new String[3];
        healthPlans[0] = plan1.getName();
        healthPlans[1] = plan2.getName();

        Employee employee = new Employee(1, "John Frusciante");

        employee.addHealthPlan(0, "C Insurance");
        System.out.println(Arrays.toString(employee.getHealthPlans()));
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
