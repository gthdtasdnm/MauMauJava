package GameLoop;

abstract class State {

    abstract void enter(); 
    abstract void update(); 
    abstract void exit(); 
}
