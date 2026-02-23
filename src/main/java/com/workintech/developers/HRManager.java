package com.workintech.developers;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);

        // Boyutları ihtiyacına göre değiştirebilirsin
        this.juniorDevelopers = new JuniorDeveloper[10];
        this.midDevelopers = new MidDeveloper[10];
        this.seniorDevelopers = new SeniorDeveloper[10];
    }

    @Override
    public void work() {
        System.out.println("HRManager manages hiring and team organization.");
        setSalary(getSalary() + 1500);
    }



    public void addEmployee(JuniorDeveloper dev, int index) {
        if (!isValidIndex(index, juniorDevelopers.length)) return;

        if (juniorDevelopers[index] != null) {
            System.out.println("Uyarı: juniorDevelopers[" + index + "] dolu. Veri ezilmedi.");
            return;
        }
        juniorDevelopers[index] = dev;
        System.out.println("JuniorDeveloper eklendi -> index: " + index);
    }

    public void addEmployee(MidDeveloper dev, int index) {
        if (!isValidIndex(index, midDevelopers.length)) return;

        if (midDevelopers[index] != null) {
            System.out.println("Uyarı: midDevelopers[" + index + "] dolu. Veri ezilmedi.");
            return;
        }
        midDevelopers[index] = dev;
        System.out.println("MidDeveloper eklendi -> index: " + index);
    }

    public void addEmployee(SeniorDeveloper dev, int index) {
        if (!isValidIndex(index, seniorDevelopers.length)) return;

        if (seniorDevelopers[index] != null) {
            System.out.println("Uyarı: seniorDevelopers[" + index + "] dolu. Veri ezilmedi.");
            return;
        }
        seniorDevelopers[index] = dev;
        System.out.println("SeniorDeveloper eklendi -> index: " + index);
    }



    public void addEmployee(JuniorDeveloper dev) {
        int idx = firstEmptyIndex(juniorDevelopers);
        if (idx == -1) {
            System.out.println("Uyarı: juniorDevelopers dizisi dolu. Eklenemedi.");
            return;
        }
        juniorDevelopers[idx] = dev;
        System.out.println("JuniorDeveloper eklendi -> index: " + idx);
    }

    public void addEmployee(MidDeveloper dev) {
        int idx = firstEmptyIndex(midDevelopers);
        if (idx == -1) {
            System.out.println("Uyarı: midDevelopers dizisi dolu. Eklenemedi.");
            return;
        }
        midDevelopers[idx] = dev;
        System.out.println("MidDeveloper eklendi -> index: " + idx);
    }

    public void addEmployee(SeniorDeveloper dev) {
        int idx = firstEmptyIndex(seniorDevelopers);
        if (idx == -1) {
            System.out.println("Uyarı: seniorDevelopers dizisi dolu. Eklenemedi.");
            return;
        }
        seniorDevelopers[idx] = dev;
        System.out.println("SeniorDeveloper eklendi -> index: " + idx);
    }



    private boolean isValidIndex(int index, int length) {
        if (index < 0 || index >= length) {
            System.out.println("Uyarı: Geçersiz index (" + index + "). Aralık: 0 - " + (length - 1));
            return false;
        }
        return true;
    }

    private <T> int firstEmptyIndex(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) return i;
        }
        return -1;
    }
}