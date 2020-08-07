public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries...");
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");
        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);
        binDir.add(new File("vi", 10000));
        binDir.add(new File("latex", 20000));
        rootDir.visit("");

        System.out.println();
        System.out.println("Making user entries...");
        Directory changshin = new Directory("박창신");
        Directory hyunseok = new Directory("유현석");
        Directory ghojeong = new Directory("고정완");
        usrDir.add(changshin);
        usrDir.add(hyunseok);
        usrDir.add(ghojeong);
        changshin.add(new File("diary.html", 100));
        changshin.add(new File("Composite.java", 200));
        hyunseok.add(new File("memo.tex", 300));
        ghojeong.add(new File("game.doc", 400));
        ghojeong.add(new File("junk.mail", 500));

        rootDir.visit("");
    }
}
