package zemberek;
import zemberek.morphology.analysis.WordAnalysis;
import zemberek.morphology.analysis.tr.TurkishMorphology;
import java.io.IOException;
import java.util.List;

public class main
{
    public static void main(String[] args) throws IOException
    {
        TurkishMorphology morphology = TurkishMorphology.createWithDefaults();
        List<WordAnalysis> results = morphology.analyze("tutunamayanlar");
        results.forEach(s -> System.out.println(s.formatLong()));
    }
}
