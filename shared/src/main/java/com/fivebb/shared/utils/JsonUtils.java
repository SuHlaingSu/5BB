package com.fivebb.shared.utils;

import android.content.Context;
import org.json.JSONException;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by aung on 12/12/15.
 */
public class JsonUtils {

    private static final String PATH_DUMMY_DATA = "bundled_data";

    /**
     * Read text from assets folder.
     *
     * @param fileName
     * @return
     * @throws IOException
     */
    private static byte[] readJsonFile(Context context, String fileName) throws IOException {
        InputStream inStream = context.getAssets().open(fileName);
        int size = inStream.available();
        byte[] buffer = new byte[size];
        inStream.read(buffer);
        inStream.close();
        return buffer;
    }

    /**
     * @param fileName - name of Json File.
     * @return JSONObject from loaded file.
     * @throws IOException
     * @throws JSONException
     */
    public static String loadData(Context context, String fileName) throws IOException, JSONException {
        byte[] buffer = readJsonFile(context, fileName);
        return new String(buffer, "UTF-8").toString();
    }
}
