package proxypattern;

public class Agent implements Singer{

    private Singer singer;

    public Agent(Singer singer){
        this.singer = singer;
    }

    @Override
    public void sing() {
        System.out.println("agent work 1");
        System.out.println("agent work 2");
        System.out.println("agent work 3");
        System.out.println("agent work 4");
        singer.sing();
        System.out.println("agent work 5");
        System.out.println("agent work 6");
    }
}
