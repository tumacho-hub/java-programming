package day_32_Arrays_split;

/*
Deploying etsy to us-east-1...
Deployment completed for us-east-1


Deploying etsy to us-west-1...
Deployment completed for us-west-1

Deploying etsy to us-west-2...
Deployment completed for us-west-2

 */
public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";
        System.out.println("-------- Starting deploying etsy app to aws zones------- ");
        String[] zonesToDeploy = zones.split(",");
        for (String eachZones : zonesToDeploy) {
            System.out.println("Deploying ["+app+"] to " + eachZones + "...");
            System.out.println(eachZones);
        }
    }
}
