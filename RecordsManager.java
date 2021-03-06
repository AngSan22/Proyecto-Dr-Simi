import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
/**
 * Write a description of class RecordsManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecordsManager extends Actor
{
    private String recordsFile;
    private int maxRecordsFile;
    final static Charset ENCODING = StandardCharsets.UTF_8;
    
    public RecordsManager(String recordsFile, int maxRecordsInFile) {
        this.recordsFile = recordsFile;
        this.maxRecordsFile = maxRecordsInFile;
    }
    
    public void act()
    {
        // Add your action code here.
    }
    
    public void save(GameRecord record) {
        List<GameRecord> records = getRecords();
        List<String> lines = new LinkedList<>();

        records.add(record);

        records.sort(Comparator.comparingInt(GameRecord::getScore).reversed());

        int counter = 0;
        for (GameRecord orderedRecord: records){
            lines.add(orderedRecord.getPlayerName() + "," + orderedRecord.getScore());

            counter++;
            if (counter >= maxRecordsFile){
                break;
            }
        }

        try {
            Files.write(Path.of(recordsFile), lines, ENCODING);
        } catch (IOException e) {
            System.err.println("Error guardando archivo");
        }
    }

    public List<GameRecord> getRecords() {
        Path path = Path.of(recordsFile);
        List<GameRecord> records = new LinkedList<>();

        try (Scanner scanner = new Scanner(path, ENCODING.name())){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] recordInfo = line.split(",");

                records.add(new GameRecord(recordInfo[0], Integer.parseInt(recordInfo[1])));
            }
        } catch (IOException e){
            System.err.println("No se pudo leer el archivo");
        }

        return records;
    }
}
