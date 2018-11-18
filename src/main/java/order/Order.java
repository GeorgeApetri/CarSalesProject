//package order;
//
//import client.Client;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Order {
//
//    Integer sum;
//    Integer valCategory;
//    String typeCategory;
//    Integer valCombustible;
//    String typeCombustible;
//    Integer valTransmission;
//    String typeTransmission;
//    Integer valEngineCapacity;
//    Integer typeEngineCapacity;
//    Integer valTankCapacity;
//    Integer typeTankCapacity;
//    Double typeFuelConsumption;
//
//    private Map<Category, Integer> categoryCar;
//    private Map<Combustible, Integer> combustibleCar;
//    private Map<Transmission, Integer> transmissionCar;
//    private Map<EngineCapacity, Integer> engineCapacityCar;
//    private Map<TankCapacity, Integer> tankCapacityCar;
//    private Map<FuelConsumption, Integer> fuelConsumptionCar;
//
//    public void startConfigurator() {
//
//        client();
//        configuratorCategory();
//        configuratorCombustible();
//        configuratorTransmission();
//        configuratorEngineCapacity();
//        configuratorTankCapacity();
//        configuratorFuelConsumption();
//        System.out.println();
//        sum = valCategory + valCombustible + valTransmission + valEngineCapacity + valTankCapacity;
//        System.out.println( "valoarea configurarilor actuale: " + sum + " EURO" );
//        System.out.println( "caracteristici: " + typeCategory + ", " + typeCombustible + ", " + typeTransmission + ", " +
//                typeEngineCapacity + ", " + typeTankCapacity );
//
//    }
//
//    public String client() {
//
//        System.out.println();
//        System.out.println( "introduceti numele persoanei pentru care se face aceasta configurare: " );
//        System.out.println();
//        Scanner scanner = new Scanner( System.in );
//        String name = scanner.nextLine();
//
//        Client client = new Client( name );
//        System.out.println( "configurare pentru " + client.getName() + ":" );
//        System.out.println();
//        return null;
//    }
//
//    public Integer configuratorCategory() {
//
//        categoryCar = new LinkedHashMap<Category, Integer>();
//
//        System.out.println( "alegeti autoturismul dorit in functie de cod:" );
//        System.out.println();
//        System.out.println( "cod:" + "\t" + "tip:" + "\t" + "pret standard:" + "\t" + "stoc:" );
//        System.out.println();
//
//        int i = 0;
//
//        Category category = new Category( i++, "auto1", 12000 );
//        categoryCar.put( category, 3 );
//        System.out.println( i + "\t" + category.getTypeCategory() + "\t" + category.getPriceCategory() + "\t" + categoryCar.get( category ) );
//        Category category1 = new Category( i++, "auto2", 14000 );
//        categoryCar.put( category1, 3 );
//        System.out.println( i + "\t" + category1.getTypeCategory() + "\t" + category1.getPriceCategory() + "\t" + categoryCar.get( category1 ) );
//        Category category2 = new Category( i++, "auto3", 18000 );
//        categoryCar.put( category2, 3 );
//        System.out.println( i + "\t" + category2.getTypeCategory() + "\t" + category2.getPriceCategory() + "\t" + categoryCar.get( category2 ) );
//
//        Scanner scanner = new Scanner( System.in );
//        int option = scanner.nextInt();
//        if (option == 1) {
//            System.out.println( "ati ales: " + category.getTypeCategory() );
//            System.out.println( "valoare standard: " + category.getPriceCategory() + " EURO" );
//            valCategory = category.getPriceCategory();
//            typeCategory = category.getTypeCategory();
//        }
//        if (option == 2) {
//            System.out.println( "ati ales: " + category1.getTypeCategory() );
//            System.out.println( "valoare standard: " + category1.getPriceCategory() + " EURO" );
//            valCategory = category1.getPriceCategory();
//            typeCategory = category1.getTypeCategory();
//        }
//        if (option == 3) {
//            System.out.println( "ati ales: " + category2.getTypeCategory() );
//            System.out.println( "valoare standard: " + category2.getPriceCategory() + " EURO" );
//            valCategory = category2.getPriceCategory();
//            typeCategory = category2.getTypeCategory();
//        }
////        System.out.println(categoryCar);
//        return valCategory;
//    }
//
//    public Integer configuratorCombustible() {
//
//        combustibleCar = new LinkedHashMap<Combustible, Integer>();
//
//        System.out.println();
//        System.out.println( "alegeti combustibilul dorit in functie de cod:" );
//        System.out.println();
//        System.out.println( "cod:" + "\t" + "tip:" + "\t" + "pret standard:" );
//        System.out.println();
//
//        Combustible combustible1 = new Combustible( "benzina", 0 );
//        combustibleCar.put( combustible1, 1 );
//        System.out.println( 1 + "\t" + combustible1.getTypeCombustible() + "\t" + combustible1.getPriceCombustible() );
//        Combustible combustible2 = new Combustible( "motorina", 500 );
//        combustibleCar.put( combustible2, 2 );
//        System.out.println( 2 + "\t" + combustible2.getTypeCombustible() + "\t" + combustible2.getPriceCombustible() );
//
//        Scanner scanner = new Scanner( System.in );
//        int option = scanner.nextInt();
//        if (option == 1) {
//            System.out.println( "ati ales: " + combustible1.getTypeCombustible() );
//            System.out.println( "valoare suplimentara: " + combustible1.getPriceCombustible() + " EURO" );
//            valCombustible = combustible1.getPriceCombustible();
//            typeCombustible = combustible1.getTypeCombustible();
//
//        }
//        if (option == 2) {
//            System.out.println( "ati ales: " + combustible2.getTypeCombustible() );
//            System.out.println( "valoare suplimentara: " + combustible2.getPriceCombustible() + " EURO" );
//            valCombustible = combustible2.getPriceCombustible();
//            typeCombustible = combustible2.getTypeCombustible();
//
//        }
////        System.out.println(combustibleCar);
//        return valCombustible;
//    }
//
//    public Integer configuratorTransmission() {
//
//        transmissionCar = new LinkedHashMap<Transmission, Integer>();
//
//        System.out.println();
//        System.out.println( "alegeti transmisia dorita in functie de cod:" );
//        System.out.println();
//        System.out.println( "cod:" + "\t" + "tip:" + "\t" + "pret standard:" );
//        System.out.println();
//
//        Transmission transmission1 = new Transmission( "manuala", 0 );
//        transmissionCar.put( transmission1, 1 );
//        System.out.println( 1 + "\t" + transmission1.getTypeTransmission() + "\t" + transmission1.getPriceTransmission() );
//        Transmission transmission2 = new Transmission( "automata", 1500 );
//        transmissionCar.put( transmission2, 2 );
//        System.out.println( 2 + "\t" + transmission2.getTypeTransmission() + "\t" + transmission2.getPriceTransmission() );
//
//        Scanner scanner = new Scanner( System.in );
//        int option = scanner.nextInt();
//        if (option == 1) {
//            System.out.println( "ati ales: " + transmission1.getTypeTransmission() );
//            System.out.println( "valoare suplimentara: " + transmission1.getPriceTransmission() + " EURO" );
//            valTransmission = transmission1.getPriceTransmission();
//            typeTransmission = transmission1.getTypeTransmission();
//
//        }
//        if (option == 2) {
//            System.out.println( "ati ales: " + transmission2.getTypeTransmission() );
//            System.out.println( "valoare suplimentara: " + transmission2.getPriceTransmission() + " EURO" );
//            valTransmission = transmission2.getPriceTransmission();
//            typeTransmission = transmission2.getTypeTransmission();
//
//        }
////        System.out.println(transmissionCar);
//        return valTransmission;
//    }
//
//    public Integer configuratorEngineCapacity() {
//
//        engineCapacityCar = new LinkedHashMap<EngineCapacity, Integer>();
//
//        System.out.println();
//        System.out.println( "alegeti capacitatea dorita in functie de cod:" );
//        System.out.println();
//        System.out.println( "cod:" + "\t" + "tip:" + "\t" + "pret standard:" );
//        System.out.println();
//
//        EngineCapacity engineCapacity1 = new EngineCapacity( 1400, 250 );
//        engineCapacityCar.put( engineCapacity1, 1 );
//        System.out.println( 1 + "\t" + engineCapacity1.getTypeCapacity() + "\t" + engineCapacity1.getPriceCapacity() );
//        EngineCapacity engineCapacity2 = new EngineCapacity( 1600, 500 );
//        engineCapacityCar.put( engineCapacity2, 2 );
//        System.out.println( 2 + "\t" + engineCapacity2.getTypeCapacity() + "\t" + engineCapacity2.getPriceCapacity() );
//        EngineCapacity engineCapacity3 = new EngineCapacity( 2000, 1000 );
//        engineCapacityCar.put( engineCapacity3, 3 );
//        System.out.println( 3 + "\t" + engineCapacity3.getTypeCapacity() + "\t" + engineCapacity3.getPriceCapacity() );
//
//        Scanner scanner = new Scanner( System.in );
//        int option = scanner.nextInt();
//        if (option == 1) {
//            System.out.println( "ati ales: " + engineCapacity1.getTypeCapacity() );
//            System.out.println( "valoare suplimentara: " + engineCapacity1.getPriceCapacity() + " EURO" );
//            valEngineCapacity = engineCapacity1.getPriceCapacity();
//            typeEngineCapacity = engineCapacity1.getTypeCapacity();
//        }
//        if (option == 2) {
//            System.out.println( "ati ales: " + engineCapacity2.getTypeCapacity() );
//            System.out.println( "valoare suplimentara: " + engineCapacity2.getPriceCapacity() + " EURO" );
//            valEngineCapacity = engineCapacity2.getPriceCapacity();
//            typeEngineCapacity = engineCapacity2.getTypeCapacity();
//        }
//        if (option == 3) {
//            System.out.println( "ati ales: " + engineCapacity3.getTypeCapacity() );
//            System.out.println( "valoare suplimentara: " + engineCapacity3.getPriceCapacity() + " EURO" );
//            valEngineCapacity = engineCapacity3.getPriceCapacity();
//            typeEngineCapacity = engineCapacity3.getTypeCapacity();
//        }
//
////        System.out.println(engineCapacityCar);
//        return valEngineCapacity;
//    }
//
//    public Integer configuratorTankCapacity() {
//
//        tankCapacityCar = new LinkedHashMap<TankCapacity, Integer>();
//
//        System.out.println();
//        System.out.println( "alegeti rezervorul dorit in functie de cod:" );
//        System.out.println();
//        System.out.println( "cod:" + "\t" + "tip:" + "\t" + "pret standard:" );
//        System.out.println();
//
//        TankCapacity tankCapacity1 = new TankCapacity( 50, 0 );
//        tankCapacityCar.put( tankCapacity1, 1 );
//        System.out.println( 1 + "\t" + tankCapacity1.getTypeTankCapacity() + "\t" + tankCapacity1.getPriceTankCapacity() );
//        TankCapacity tankCapacity2 = new TankCapacity( 62, 250 );
//        tankCapacityCar.put( tankCapacity2, 2 );
//        System.out.println( 2 + "\t" + tankCapacity2.getTypeTankCapacity() + "\t" + tankCapacity2.getPriceTankCapacity() );
//        TankCapacity tankCapacity3 = new TankCapacity( 70, 500 );
//        tankCapacityCar.put( tankCapacity3, 3 );
//        System.out.println( 3 + "\t" + tankCapacity3.getTypeTankCapacity() + "\t" + tankCapacity3.getPriceTankCapacity() );
//
//        Scanner scanner = new Scanner( System.in );
//        int option = scanner.nextInt();
//        if (option == 1) {
//            System.out.println( "ati ales: " + tankCapacity1.getTypeTankCapacity() );
//            System.out.println( "valoare suplimentara: " + tankCapacity1.getPriceTankCapacity() + " EURO" );
//            valTankCapacity = tankCapacity1.getPriceTankCapacity();
//            typeTankCapacity = tankCapacity1.getTypeTankCapacity();
//        }
//        if (option == 2) {
//            System.out.println( "ati ales: " + tankCapacity2.getTypeTankCapacity() );
//            System.out.println( "valoare suplimentara: " + tankCapacity2.getPriceTankCapacity() + " EURO" );
//            valTankCapacity = tankCapacity2.getPriceTankCapacity();
//            typeTankCapacity = tankCapacity2.getTypeTankCapacity();
//        }
//        if (option == 3) {
//            System.out.println( "ati ales: " + tankCapacity3.getTypeTankCapacity() );
//            System.out.println( "valoare suplimentara: " + tankCapacity3.getPriceTankCapacity() + " EURO" );
//            valTankCapacity = tankCapacity3.getPriceTankCapacity();
//            typeTankCapacity = tankCapacity3.getTypeTankCapacity();
//        }
//
////        System.out.println(tankCapacityCar);
//        return valTankCapacity;
//    }
//
//    public Double configuratorFuelConsumption() {
//
//        fuelConsumptionCar = new LinkedHashMap<FuelConsumption, Integer>();
//
//        return typeFuelConsumption;
//    }
//}
//
