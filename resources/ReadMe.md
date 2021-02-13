## Recap
Interface

## How to use interface
1. Implement in class 
2. do inline implementation using anonymous class 
2. lambdas // Generics 

## Can interface extend more than 1 interface ? 
yes
example 
```java
public interface Work extends Play, Enjoy {
    
}
```

## How to we create Anonymous class
example interface is

```java
public interface Play {
    String getPlayName();
}


public class Run {
    private Play play = new Play() {
        @Override
        public String getPlayName() {
            return null;
        }
    };

}

// or 
public class Run {
    public void doAnyThing() {
        Play play = new Play() {
            @Override
            public String getPlayName() {
                return null;
            }
        };
    }

}

//or
public class Run {
    
    public static void main(String ...args) {
        Run run = new Run();
        
        run.doSomething( new Play(){
                public String getPlayName() {
                    return null; } 
                } 
            );
    }
    
    public void doSomeThing(Play play) {
        play.getPlayName();
    }
}


```

