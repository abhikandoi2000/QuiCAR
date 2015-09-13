package in.co.sdslabs.quickr;

/**
 * Created by abhi on 13/9/15.
 */
public class SearchItems {
    public static final String brand_name[] = { "Ashok Leyland", "Aston Martin", "Audi", "Bentley", "BMW", "Bugatti", "Caterham",
            "Chevrolet", "Conquest", "Daewoo", "Datsun", "DC", "Ferrari", "Fiat", "Force One", "Ford", "Hindustan Motors",
            "Honda", "Hyundai", "ICML", "Isuzu", "Jaguar", "Koenigsegg", "Lamborghini", "Land Rover", "Mahindra", "Maruti Suzuki",
            "Maserati", "Mercedes Benz", "Mini", "Mitsubishi", "Nissan", "Opel", "Others","Porsche", "Premier",
            "Renault", "Rolls Royce", "San Motors", "Skoda", "Tata", "Toyota", "Volkswagen", "Volvo" };
    public static final String model_name[] =  { "7", "1 Series", "3 Door", "3 Series", "370Z", "458 Italia", "458 Speciale", "458 Spider", "5 Door",
            "5 Series", "599 GTB Fiorano", "6 Series", "7 Series", "911 Convertible", "911 Coupe", "A Class", "A Star", "A3",
            "A3 cabriolet", "A4", "A6", "A7", "A8", "A8 L", "Accent", "Accord", "Agera", "Altis", "Alto", "Alto 800", "Alto K10",
            "Amaze", "Ambassador", "Aria", "Armada", "Arnage", "Astra", "Avanti", "Aventador Convertible", "Aventador Coupe", "Aveo",
            "Aveo U-VA", "Avventura", "B Class", "Baleno", "Beat", "Beetle", "Bolero", "Bolt", "Boxster", "Brio",
            "C Class", "California", "Camry", "Captiva", "Cayenne", "Cayman", "Cedia", "Celerio", "Celica", "Ciaz", "Cielo",
            "City", "City ZX", "Civic", "CL Class", "CL Range", "CLA Class", "Classic", "CLK", "CLS", "CLS Class",
            "Contessa", "Continental", "Cooper", "Cooper Convertible", "Corolla", "Corolla Altis", "Corsa",
            "Coupe GT", "Cross Polo", "Cruze", "CRV", "Datsun Go", "DB9", "DBS", "Discover", "Discovery 3", "Discovery 4", "Duster",
            "E Class", "e20", "e2o", "Ecosport", "Eeco", "Elantra", "Elite i20", "Endeavor", "Enjoy", "Eon", "Ertiga", "Estate",
            "Esteem", "Etios", "Etios Cross", "Etios Liva", "Evade", "Evalia", "Extreme", "F Type", "F12 Berlinetta", "F50 Spider",
            "Fabia", "FF", "Fiesta", "Fiesta Classic", "Figo", "Fluence", "Flying Spur", "Force Once EX", "Force Once LX",
            "Fortuner", "Freelander 2", "Fusion", "G Class", "Gallardo", "Getz", "Getz Prime", "Ghost", "GL Class", "GLA Class",
            "GO", "GO Plus", "Gran Cabrio", "Gran Turismo", "Grand i10", "Grand Vitara", "Grande Punto", "Gurkha", "Gypsy",
            "Huracan", "i10", "i20", "i20 Active", "i8", "Ikon", "Indica", "Indica eV2", "Indica V2", "Indica V2 Turbo",
            "Indica V2 Xeta", "Indica Vista", "Indica Xeta", "Indigo", "Indigo CS", "Indigo ECS", "Indigo Marina", "Indigo V Series",
            "Indigo XL", "Innova", "Jazz", "Jeep", "Jetta", "Kizashi", "Koleos", "L & K", "Lancer", "Lancer Evolution X",
            "Land Cruiser", "Laura", "Linea", "Linea Classic", "Lodgy", "Logan", "Logan Edge", "M Class", "M Series",
            "Macan", "Manza", "Marshal DI", "Maruti 1000", "Maruti 800", "Matiz", "Maxx", "Micra", "Micra Active", "Mini Cooper",
            "Mini Cooper Countryman", "MM Range", "Mobilio", "Montero", "Movus", "MU 7", "Mulsanne", "Murcielago", "Nano",
            "Neo Fluidic Elantra", "New City", "New Ikon", "New Yeti", "Nexia", "Octavia", "Omni", "One 77", "One SUV", "Optra",
            "Optra Magnum", "Outlander", "Pajero", "Palio", "Palio Stile", "Palio Stile Multijet", "Panamera", "Passat", "Petra",
            "Phaeton", "Phantom Convertible", "Phantom Coupe", "Phantom Sedan", "Polo", "Prado", "Prius", "Pulse", "Punto", "Punto Adventure",
            "Punto EVO", "Q3", "Q5", "Q7", "Qualis", "Quanto", "Quattroporte", "R Class", "R8", "Range Rover", "Range Rover Evoque",
            "Range Rover Sport", "Rapid", "Rapide", "Reva", "Rexton", "Rhino Rx", "Rio", "Ritz", "RS5", "RS7", "S Class", "S4", "S40", "S6",
            "S60", "S80", "Safari", "Safari Dicor", "Safari Storme", "Sail", "Sail U-VA", "Santa Fe", "Santro", "Santro Xing", "Scala",
            "Scorpio", "Scorpio W", "Siena", "SL Class", "SLK Class", "SLS", "SLS AMG", "Sonata", "Sonata Embera", "Sonata Transform",
            "Spark", "Spark LPG", "SRV", "Stile", "Storm", "Sumo", "Sumo Grande", "Sumo Spacio", "Sumo Victa", "Sunny", "Superb", "Swift",
            "Swift Dzire", "SX4", "Tavera", "Tavera Neo", "Teana", "Terrano", "Thar", "Touareg", "TT", "Tucson", "Uno", "V40 Cross Country",
            "Vanquish", "Vantage", "Vectra", "Vento", "Venture", "Verito", "Verito Vibe", "Verna", "Verna Fluidic", "Versa", "Veyron", "Virage",
            "Vista", "Voyager", "Wagon R", "Wagon R Duo", "Wagon R Stingray", "Winger", "Wraith", "X-Trail", "X1", "X3", "X5", "X6", "XC60",
            "XC90", "Xcent", "Xenon XT", "XF", "XJ", "XK", "XUV 500", "Xylo", "Yeti", "Z4 Convertible", "Z4 Coupe", "Zen", "Zen Estilo", "Zest" };
}
