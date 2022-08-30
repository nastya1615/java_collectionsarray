package practice.hospital;



public class Hospital {

    public static void main(String[] args) {
        generatePatientsTemperatures(15);
    }

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] patient = new float[patientsCount];

        for(int i=0; i< patient.length; i++){
            float temperature =Math.round((32 +Math.random()*8)*10) / 10f;
            patient[i] = temperature;

        }

        getReport(patient);

        return patient;
    }

    public static String getReport(float[] temperatureData) {

        String temperatureOfAllPatients = "";
        float averageTemperature = 0;
        int healthyPatients = 0;

        for (float temperature:temperatureData
             ) {


            temperatureOfAllPatients += " "+temperature;
            averageTemperature+=temperature;

            if(temperature>=36.2 && temperature<37.0){
                healthyPatients++;
            }
        }

        System.out.println(healthyPatients);
        averageTemperature = Math.round((averageTemperature/temperatureData.length)*100)/100f;

        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */

        String report =
            "Температуры пациентов:" + temperatureOfAllPatients +
            "\nСредняя температура: " + averageTemperature +
            "\nКоличество здоровых: " + healthyPatients;

        return report;
    }
}
