package openClosePrinciple;

// the functionality of this class is to validate insurance claims
public class HealthInsuranceSurveyor extends InsuranceSurveyor {
    public boolean isValidClaim() {
        System.out.println("HealthInsuranceSurveyor: Validating health insurance claim...");
        // logic to validate claim
        return true;
    }
}
