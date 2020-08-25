package lesson2.computer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Artline Business B27", 2010, 8, 8699, new HardDisk("Kingston", DiskType.SSD, 240, ManufactureCountry.CHINA), new Processor("i3", 4, 3.6, ManufactureCountry.UKRAINE));
        Computer computer2 = new Computer("Artline Gaming X51", 2012, 6, 22222, new HardDisk("Kingston", DiskType.HDD, 480, ManufactureCountry.KOREA), new Processor("i5", 6, 4.1, ManufactureCountry.UKRAINE));
        Computer computer3 = new Computer("Artline Gaming X46", 2013, 8, 18888, new HardDisk("Kingston", DiskType.SSDandHDD, 240, ManufactureCountry.CHINA), new Processor("Ryzen 5", 6, 3.6, ManufactureCountry.UKRAINE));
        Computer computer4 = new Computer("Artline Gaming X48", 2012, 16, 17699, new HardDisk("Kingston", DiskType.SSDandHDD, 240, ManufactureCountry.CHINA), new Processor("Ryzen 5", 4, 3.9, ManufactureCountry.UKRAINE));
        Computer computer5 = new Computer("Artline Gaming X56", 2010, 8, 8699, new HardDisk("Kingston", DiskType.SSD, 500, ManufactureCountry.CHINA), new Processor("i7", 4, 3.6, ManufactureCountry.UKRAINE));
        Computer computer6 = new Computer("Artline Gaming X65", 2010, 8, 18000, new HardDisk("Kingston", DiskType.HDD, 240, ManufactureCountry.CHINA), new Processor("i3", 4, 3.6, ManufactureCountry.USA));
        Computer computer7 = new Computer("Expert", 2010, 16, 12999, new HardDisk("Kingston", DiskType.SSD, 240, ManufactureCountry.CHINA), new Processor("i3", 4, 3.6, ManufactureCountry.UKRAINE));
        Computer computer8 = new Computer("Acer", 2010, 8, 8699, new HardDisk("Kingston", DiskType.SSD, 240, ManufactureCountry.CHINA), new Processor("i5", 4, 3.6, ManufactureCountry.USA));
        Computer computer9 = new Computer("Asus RPG Strix", 2010, 8, 18699, new HardDisk("Kingston", DiskType.SSD, 1000, ManufactureCountry.CHINA), new Processor("i7", 4, 3.6, ManufactureCountry.UKRAINE));
        Computer computer10 = new Computer("Everest Home 4070", 2010, 6, 8699, new HardDisk("Kingston", DiskType.SSD, 500, ManufactureCountry.CHINA), new Processor("i3", 4, 3.6, ManufactureCountry.INDIA));
        Computer computer11 = new Computer("Apple Mac mini", 2010, 8, 16699, new HardDisk("Kingston", DiskType.HDD, 240, ManufactureCountry.CHINA), new Processor("i3", 4, 3.6, ManufactureCountry.UKRAINE));
        Computer computer12 = new Computer("Asus", 2010, 8, 9699, new HardDisk("Kingston", DiskType.HDD, 1000, ManufactureCountry.CHINA), new Processor("i3", 4, 3.6, ManufactureCountry.UKRAINE));
        Computer computer13 = new Computer("Acer", 2010, 8, 8699, new HardDisk("Kingston", DiskType.SSD, 480, ManufactureCountry.CHINA), new Processor("i3", 4, 3.6, ManufactureCountry.UKRAINE));
        Computer computer14 = new Computer("Cobra I94F", 2010, 8, 10999, new HardDisk("Kingston", DiskType.SSD, 1000, ManufactureCountry.CHINA), new Processor("i3", 4, 3.6, ManufactureCountry.CHINA));
        Computer computer15 = new Computer("ASUS", 2010, 6, 8699, new HardDisk("Kingston", DiskType.SSD, 240, ManufactureCountry.CHINA), new Processor("i3", 4, 3.6, ManufactureCountry.USA));
        Computer computer16 = new Computer("Expert", 2010, 8, 9999, new HardDisk("Kingston", DiskType.SSD, 480, ManufactureCountry.CHINA), new Processor("i5", 4, 3.6, ManufactureCountry.UKRAINE));
        Computer computer17 = new Computer("Apple Mac", 2010, 16, 8699, new HardDisk("Kingston", DiskType.HDD, 500, ManufactureCountry.USA), new Processor("i7", 4, 3.6, ManufactureCountry.UKRAINE));
        Computer computer18 = new Computer("Acer", 2010, 8, 28699, new HardDisk("Kingston", DiskType.SSD, 500, ManufactureCountry.CHINA), new Processor("i3", 4, 3.6, ManufactureCountry.CHINA));
        Computer computer19 = new Computer("Asus", 2010, 6, 19000, new HardDisk("Kingston", DiskType.HDD, 1000, ManufactureCountry.USA), new Processor("i7", 4, 3.6, ManufactureCountry.KOREA));
        Computer computer20 = new Computer("Expert", 2010, 8, 15699, new HardDisk("Kingston", DiskType.SSD, 1000, ManufactureCountry.CHINA), new Processor("i7", 4, 3.6, ManufactureCountry.CHINA));
        List<Computer> computerList = new ArrayList<>();
        computerList.add(computer1);
        computerList.add(computer2);
        computerList.add(computer3);
        computerList.add(computer4);
        computerList.add(computer5);
        computerList.add(computer6);
        computerList.add(computer7);
        computerList.add(computer8);
        computerList.add(computer9);
        computerList.add(computer10);
        computerList.add(computer11);
        computerList.add(computer12);
        computerList.add(computer13);
        computerList.add(computer14);
        computerList.add(computer15);
        computerList.add(computer16);
        computerList.add(computer17);
        computerList.add(computer18);
        computerList.add(computer19);
        computerList.add(computer20);
        //. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//        for (Computer c : computerList) {
//            if (c.getYear() > 2010) {
//                System.out.println(c);
//            }
//        }
        //2. Знайти всі комп'ютери які мають рік випуску більше ніж 2010 та країну виробник Китай
//        for (Computer c : computerList) {
//            if (c.getProcessor().getManufacture() == ManufactureCountry.CHINA) {
//                System.out.println(c);
//            }
//        }
        //3. Знайти всі комп'ютери які мають рік випуску більше ніж 2010 та країну виробник дисків не Китай
//        for (Computer c : computerList) {
//            if (c.getYear() > 2010 && c.getHardDisk().getManufactureCountry() != ManufactureCountry.CHINA) {
//                System.out.println(c);
//            }
//        }
        //4. Знайти всі комп'ютери які мають жорсткий диск більше 500гб
//        for (Computer c : computerList) {
//            if (c.getHardDisk().getDiskSpace() > 500) {
//                System.out.println(c);
//            }
//        }
        //5. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7
//        for (Computer c : computerList) {
//            if (c.getHardDisk().getDiskSpace() > 500 && c.getProcessor().getProcessorType() == "i7") {
//                System.out.println(c);
//            }
//        }
        //6. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7 посортувати за ціною
        Collections.sort(computerList);
        for (Computer c : computerList) {
            if (c.getHardDisk().getDiskSpace() > 500 && c.getProcessor().getProcessorType().equals("i7")) {
                System.out.println(c);
            }
        }
    }
}




