import java.io.Serializable;

public class ComputerList implements Serializable {
    private Computer[] computers;
    private int size;

    public ComputerList(int capacity) {
        computers = new Computer[capacity];
        size = 0;
    }

    public void addComputer(Computer computer) {
        if (size < computers.length && computer != null) {
            computers[size] = computer;
            size++;
            ObjectFileHandler.writeObjectToFile(this, "data.txt");
        } else {
            System.out.println("Danh sách máy tính đã đầy hoặc máy tính null.");
        }
    }

    public void updateComputer(String code, Computer updatedComputer) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getID().equals(code)) {
                computers[i] = updatedComputer;
                ObjectFileHandler.writeObjectToFile(this, "data.txt");
                return;
            }
        }
        System.out.println("Không tìm thấy máy tính có mã: " + code);
    }

    public void deleteComputer(String code) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getID().equals(code)) {
                for (int j = i; j < size - 1; j++) {
                    computers[j] = computers[j + 1];
                }
                size--;
                ObjectFileHandler.writeObjectToFile(this, "data.txt");
                return;
            }
        }
        System.out.println("Không tìm thấy máy tính có mã: " + code);
    }

    public Computer getComputerByCode(String code) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getID().equals(code)) {
                return computers[i];
            }
        }
        return null;
    }

    public void displayAll() {
        for (int i = 0; i < size; i++) {
            computers[i].displayInfo();
            System.out.println();
        }
    }

    public int getSize() {
        return size;
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
