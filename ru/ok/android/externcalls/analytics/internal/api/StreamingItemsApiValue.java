package ru.ok.android.externcalls.analytics.internal.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonSyntaxException;

public class StreamingItemsApiValue extends oq0 {
    private final File file;
    private final boolean isCompressed;

    public StreamingItemsApiValue(File file2, boolean z) {
        this.file = file2;
        this.isCompressed = z;
    }

    public void write(t67 t67) throws IOException, JsonSerializeException {
        InputStream fileInputStream;
        InputStreamReader inputStreamReader;
        t67.u();
        try {
            fileInputStream = new FileInputStream(this.file);
            if (this.isCompressed) {
                fileInputStream = new GZIPInputStream(fileInputStream, 4096);
            }
            inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            t67.l(inputStreamReader);
            inputStreamReader.close();
            fileInputStream.close();
            t67.t();
            return;
            throw th;
            throw th;
        } catch (JsonSyntaxException e) {
            throw new Exception(e);
        } catch (ZipException e2) {
            throw new Exception(e2);
        } catch (Throwable th) {
            t67.t();
            throw th;
        }
    }
}
