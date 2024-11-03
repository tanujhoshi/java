
class EH12 {

    public static void main(String[] args) {

        try {

            System.out.println(Integer.parseInt(args[0]));

        }

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid Entry for Number " + e.getMessage());

        }

        catch (NumberFormatException e) {

            System.out.println("Number Format " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught general Exception: " + e.getMessage());

        }
    }
}
