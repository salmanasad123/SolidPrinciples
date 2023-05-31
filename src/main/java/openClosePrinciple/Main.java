package openClosePrinciple;

public class Main {

    public static void main(String[] args) {

        InsuranceSurveyor insuranceSurveyor = new HealthInsuranceSurveyor();

        ClaimApprovalManager claimApprovalManager = new ClaimApprovalManager();
        claimApprovalManager.processHealthClaim(insuranceSurveyor);

        // Both the HealthInsuranceSurveyor and ClaimApprovalManager classes work fine and the design
        // for the insurance system appears perfect until a new requirement to process vehicle insurance
        // claims arises. We now need to include a new VehicleInsuranceSurveyor class,
        // and this should not create any problems. But, what we also need is to modify the
        // ClaimApprovalManager class to process vehicle insurance claims.

        // In the example above, we wrote a processClaim() method to accept a InsuranceSurveyor type
        // instead of specifying a concrete type. In this way, any further addition of InsuranceSurveyor
        // implementations will not affect the ClaimApprovalManager class. Our insurance system
        // is now open to support more types of insurance claims and closed for any modifications whenever a
        // new claim type is added.
        // with new implementation we don't need to modify our ClaimApprovalManager class. We just added
        // one method that will accept InsuranceSurveyor as argument which is an abstract class.

        InsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();

        claimApprovalManager.processInsuranceClaim(vehicleInsuranceSurveyor);

    }

}
