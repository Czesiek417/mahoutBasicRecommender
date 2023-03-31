package org.example;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.similarity.LogLikelihoodSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;

import java.io.File;
import java.io.IOException;

public class Main {
    public static String dataFile = "csv/customer.csv";
    public static void main(String[] args) throws IOException, TasteException {

        DataModel model = new FileDataModel(new File(dataFile));

        LogLikelihoodSimilarity similarity = new LogLikelihoodSimilarity(model);

        System.out.println("Similarity between user1 and user3 is " + similarity.userSimilarity(1, 3));

    }
}