package com.sda.AdapterHomeWork;


interface Drawing{
    void draw(String drawingName);
}
interface PaperDrawing {
    void draw (String drawingName);
}
interface ComputerDrawing {
    void draw (String drawingName);
}

class PCDrawing implements ComputerDrawing{

    @Override
    public void draw(String drawingName) {
        System.out.println("Drawing "+ drawingName + " on the PC");
    }
}

class DraftDrawing implements PaperDrawing{

    @Override
    public void draw(String drawingName) {
        System.out.println("Drawing "+ drawingName + " on the paper");
    }
}


class DrawingAdapter implements PaperDrawing{

    private PaperDrawing paperDrawing;
    private ComputerDrawing computerDrawing;

    public DrawingAdapter( PaperDrawing paperDrawing){
        this.paperDrawing=paperDrawing;
    }

    public DrawingAdapter (ComputerDrawing computerDrawing){
        this.computerDrawing=computerDrawing;
    }

    @Override
    public void draw(String drawingName) {
        if(paperDrawing!= null){
            paperDrawing.draw(drawingName);
        }else if (computerDrawing != null){
            computerDrawing.draw(drawingName);
        }else{
            System.out.println("This kind of drawing type is not supported.");
        }

    }
}

class AdapterPattern {
    public static void main(String[] args) {

        PaperDrawing paperDrawing = new DraftDrawing();
        paperDrawing.draw("retirement home plan");

        PaperDrawing specialPaperDrawing;

        specialPaperDrawing = new DrawingAdapter(new PCDrawing());
        specialPaperDrawing.draw("retirement home plan");

    }
}

