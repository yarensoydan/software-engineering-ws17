class Main {
  public static void main(String[] args)
  {
    String conversion = args[0];
    String value = args[1];

    /*
     * TODO
     *
     * use desired conversion here
     *
    */

    UnitConverter myConverter = new DollarToEuroConverter();
    double aLotOfDollars = 10000;
    double aLotOfEuros = myConverter.convert(aLotOfDollars);
    System.out.println(myConverter.toString() + " has converted " + aLotOfDollars + " USD to " + aLotOfEuros + " EUR!");
  }
}
