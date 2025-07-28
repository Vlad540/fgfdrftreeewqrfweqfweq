package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* renamed from: y90  reason: default package */
public final class y90 {
    public final long a;

    public y90(long j) {
        this.a = j;
    }

    public static y90 a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return new y90(Long.parseLong(jsonReader.nextString()));
                } else {
                    y90 y90 = new y90(jsonReader.nextLong());
                    jsonReader.close();
                    return y90;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y90)) {
            return false;
        }
        return this.a == ((y90) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return wn6.k(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
