package defpackage;

import java.io.File;

/* renamed from: bg9  reason: default package */
public enum bg9 {
    ;
    
    public static boolean a = false;

    public static void a() {
        File[] listFiles = new File(new File(System.getProperty("java.io.tmpdir")).getAbsolutePath()).listFiles(new ag9(0));
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!new File(file.getAbsolutePath() + ".lck").exists()) {
                    try {
                        file.delete();
                    } catch (SecurityException e) {
                        System.err.println("Failed to delete old temp lib" + e.getMessage());
                    }
                }
            }
        }
    }

    public static int b() {
        String property = System.getProperty("os.name");
        if (property.contains("Linux")) {
            return 2;
        }
        if (property.contains("Mac")) {
            return 3;
        }
        if (property.contains("Windows")) {
            return 1;
        }
        if (property.contains("Solaris") || property.contains("SunOS")) {
            return 4;
        }
        throw new UnsupportedOperationException("Unsupported operating system: ".concat(property));
    }

    public static String c() {
        String str;
        int b2 = b();
        StringBuilder m = hr1.m("/", bg9.class.getPackage().getName().replace('.', '/'), "/");
        if (b2 == 1) {
            str = "win32";
        } else if (b2 == 2) {
            str = "linux";
        } else if (b2 == 3) {
            str = "darwin";
        } else if (b2 == 4) {
            str = "solaris";
        } else {
            throw null;
        }
        m.append(str);
        m.append("/");
        m.append(System.getProperty("os.arch"));
        m.append("/liblz4-java.");
        m.append(us8.d(b2));
        return m.toString();
    }
}
