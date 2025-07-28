package defpackage;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: wd  reason: default package */
public final class wd extends Handler {
    public static final wd a = new Handler();

    public final void close() {
    }

    public final void flush() {
    }

    public final void publish(LogRecord logRecord) {
        int min;
        CopyOnWriteArraySet copyOnWriteArraySet = vd.a;
        String loggerName = logRecord.getLoggerName();
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        Throwable thrown = logRecord.getThrown();
        String str = (String) vd.b.get(loggerName);
        if (str == null) {
            str = h0e.y0(23, loggerName);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                StringBuilder n = me4.n(message, "\n");
                n.append(Log.getStackTraceString(thrown));
                message = n.toString();
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int Z = h0e.Z(message, 10, i2, false, 4);
                if (Z == -1) {
                    Z = length;
                }
                while (true) {
                    min = Math.min(Z, i2 + 4000);
                    message.substring(i2, min);
                    if (min >= Z) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }
}
