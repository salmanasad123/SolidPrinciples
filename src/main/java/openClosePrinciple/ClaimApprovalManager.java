package openClosePrinciple;

// the functionality of this class is to approve the insurance claims
public class ClaimApprovalManager {

    public void processHealthClaim(InsuranceSurveyor surveyor) {
        if (surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }

    // Both the HealthInsuranceSurveyor and ClaimApprovalManager classes work fine and the design
    // for the insurance system appears perfect until a new requirement to process vehicle insurance
    // claims arises. We now need to include a new VehicleInsuranceSurveyor class,
    // and this should not create any problems. But, what we also need is to modify the
    // ClaimApprovalManager class to process vehicle insurance claims.
    // So we violated the open close principle as we need to modify the claim approval manager class.
    // if we introduce VehicleInsuranceSurveyor we need to modify ClaimApprovalManager class which will
    // violate the Open-Close Principle.
    public void processVehicleClaim(VehicleInsuranceSurveyor surveyor) {
        if (surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }

    public void processInsuranceClaim(InsuranceSurveyor surveyor) {
        if (surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}
