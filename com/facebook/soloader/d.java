package com.facebook.soloader;

import android.os.Trace;
import java.io.FileInputStream;
import java.nio.channels.ClosedByInterruptException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class d {
    static {
        new ReentrantReadWriteLock();
    }

    public static String[] a(String str, at4 at4) {
        String[] strArr;
        bt4 bt4;
        int i;
        if (SoLoader.a) {
            Api18TraceUtils.a("soloader.NativeDeps.getDependencies[", str, "]");
        }
        try {
            if (at4 instanceof bt4) {
                bt4 = (bt4) at4;
                i = 0;
                while (true) {
                    strArr = js.j(bt4);
                    break;
                }
            }
            strArr = js.j(at4);
            if (SoLoader.a) {
                Trace.endSection();
            }
            return strArr;
        } catch (ClosedByInterruptException e) {
            i++;
            if (i <= 4) {
                Thread.interrupted();
                FileInputStream fileInputStream = new FileInputStream(bt4.a);
                bt4.b = fileInputStream;
                bt4.c = fileInputStream.getChannel();
            } else {
                throw e;
            }
        } catch (d49 e2) {
            try {
                throw swb.l(str, e2);
            } catch (Throwable th) {
                if (SoLoader.a) {
                    Trace.endSection();
                }
                throw th;
            }
        }
    }
}
