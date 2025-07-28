package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\t\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\b¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0019*\u00020\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u00000\u001bH\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0000¢\u0006\u0004\b#\u0010$J1\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b&\u0010\u0011R\u0014\u0010(\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lkotlinx/coroutines/internal/FastServiceLoader;", "", "<init>", "()V", "Ljava/lang/Class;", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "baseClass", "", "serviceClass", "createInstanceOf", "(Ljava/lang/Class;Ljava/lang/String;)Lkotlinx/coroutines/internal/MainDispatcherFactory;", "S", "service", "Ljava/lang/ClassLoader;", "loader", "", "load", "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "name", "getProviderInstance", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/net/URL;", "url", "parse", "(Ljava/net/URL;)Ljava/util/List;", "R", "Ljava/util/jar/JarFile;", "Lkotlin/Function1;", "block", "use", "(Ljava/util/jar/JarFile;Lu16;)Ljava/lang/Object;", "Ljava/io/BufferedReader;", "r", "parseFile", "(Ljava/io/BufferedReader;)Ljava/util/List;", "loadMainDispatcherFactory$kotlinx_coroutines_core", "()Ljava/util/List;", "loadMainDispatcherFactory", "loadProviders$kotlinx_coroutines_core", "loadProviders", "PREFIX", "Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
public final class FastServiceLoader {
    public static final FastServiceLoader INSTANCE = new FastServiceLoader();
    private static final String PREFIX = "META-INF/services/";

    private FastServiceLoader() {
    }

    private final MainDispatcherFactory createInstanceOf(Class<MainDispatcherFactory> cls, String str) {
        try {
            return cls.cast(Class.forName(str, true, cls.getClassLoader()).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final <S> S getProviderInstance(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> load(Class<S> cls, ClassLoader classLoader) {
        try {
            return loadProviders$kotlinx_coroutines_core(cls, classLoader);
        } catch (Throwable unused) {
            return o23.s0(ServiceLoader.load(cls, classLoader));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        defpackage.urd.l(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        defpackage.jjd.d(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007f, code lost:
        defpackage.urd.l(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0082, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> parse(java.net.URL r5) {
        /*
            r4 = this;
            java.lang.String r4 = r5.toString()
            java.lang.String r0 = "jar"
            r1 = 0
            boolean r0 = defpackage.p0e.Q(r4, r0, r1)
            r2 = 0
            if (r0 == 0) goto L_0x0064
            java.lang.String r5 = "jar:file:"
            java.lang.String r5 = defpackage.h0e.u0(r4, r5)
            r0 = 6
            r3 = 33
            int r0 = defpackage.h0e.Z(r5, r3, r1, r1, r0)
            r3 = -1
            if (r0 != r3) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            java.lang.String r5 = r5.substring(r1, r0)
        L_0x0023:
            java.lang.String r0 = "!/"
            java.lang.String r4 = defpackage.h0e.u0(r4, r0)
            java.util.jar.JarFile r0 = new java.util.jar.JarFile
            r0.<init>(r5, r1)
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x0050 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0050 }
            java.util.zip.ZipEntry r3 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0050 }
            r3.<init>(r4)     // Catch:{ all -> 0x0050 }
            java.io.InputStream r4 = r0.getInputStream(r3)     // Catch:{ all -> 0x0050 }
            java.lang.String r3 = "UTF-8"
            r1.<init>(r4, r3)     // Catch:{ all -> 0x0050 }
            r5.<init>(r1)     // Catch:{ all -> 0x0050 }
            kotlinx.coroutines.internal.FastServiceLoader r4 = INSTANCE     // Catch:{ all -> 0x0052 }
            java.util.List r4 = r4.parseFile(r5)     // Catch:{ all -> 0x0052 }
            defpackage.urd.l(r5, r2)     // Catch:{ all -> 0x0050 }
            r0.close()
            return r4
        L_0x0050:
            r4 = move-exception
            goto L_0x0059
        L_0x0052:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            defpackage.urd.l(r5, r4)     // Catch:{ all -> 0x0050 }
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0059:
            throw r4     // Catch:{ all -> 0x005a }
        L_0x005a:
            r5 = move-exception
            r0.close()     // Catch:{ all -> 0x005f }
            throw r5
        L_0x005f:
            r5 = move-exception
            defpackage.jjd.d(r4, r5)
            throw r4
        L_0x0064:
            java.io.BufferedReader r4 = new java.io.BufferedReader
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.InputStream r5 = r5.openStream()
            r0.<init>(r5)
            r4.<init>(r0)
            kotlinx.coroutines.internal.FastServiceLoader r5 = INSTANCE     // Catch:{ all -> 0x007c }
            java.util.List r5 = r5.parseFile(r4)     // Catch:{ all -> 0x007c }
            defpackage.urd.l(r4, r2)
            return r5
        L_0x007c:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x007e }
        L_0x007e:
            r0 = move-exception
            defpackage.urd.l(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.FastServiceLoader.parse(java.net.URL):java.util.List");
    }

    private final List<String> parseFile(BufferedReader bufferedReader) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return o23.s0(linkedHashSet);
            }
            String obj = h0e.B0(h0e.w0(readLine, "#")).toString();
            int i = 0;
            while (i < obj.length()) {
                char charAt = obj.charAt(i);
                if (charAt == '.' || Character.isJavaIdentifierPart(charAt)) {
                    i++;
                } else {
                    throw new IllegalArgumentException("Illegal service provider class name: ".concat(obj).toString());
                }
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000e, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0010, code lost:
        defpackage.jjd.d(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0013, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r1.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <R> R use(java.util.jar.JarFile r1, defpackage.u16 r2) {
        /*
            r0 = this;
            java.lang.Object r0 = r2.invoke(r1)     // Catch:{ all -> 0x0008 }
            r1.close()
            return r0
        L_0x0008:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x000a }
        L_0x000a:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x000f }
            throw r2
        L_0x000f:
            r1 = move-exception
            defpackage.jjd.d(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.FastServiceLoader.use(java.util.jar.JarFile, u16):java.lang.Object");
    }

    public final List<MainDispatcherFactory> loadMainDispatcherFactory$kotlinx_coroutines_core() {
        MainDispatcherFactory mainDispatcherFactory;
        Class<MainDispatcherFactory> cls = MainDispatcherFactory.class;
        if (!FastServiceLoaderKt.getANDROID_DETECTED()) {
            return load(cls, cls.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = cls.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, cls.getClassLoader()).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory == null) {
                return load(cls, cls.getClassLoader());
            }
            arrayList.add(mainDispatcherFactory);
            try {
                mainDispatcherFactory2 = cls.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, cls.getClassLoader()).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 == null) {
                return arrayList;
            }
            arrayList.add(mainDispatcherFactory2);
            return arrayList;
        } catch (Throwable unused3) {
            return load(cls, cls.getClassLoader());
        }
    }

    public final <S> List<S> loadProviders$kotlinx_coroutines_core(Class<S> cls, ClassLoader classLoader) {
        ArrayList<T> list = Collections.list(classLoader.getResources(PREFIX.concat(cls.getName())));
        ArrayList arrayList = new ArrayList();
        for (T parse : list) {
            u23.K(INSTANCE.parse(parse), arrayList);
        }
        Set<String> w0 = o23.w0(arrayList);
        if (!w0.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(q23.H(w0, 10));
            for (String providerInstance : w0) {
                arrayList2.add(INSTANCE.getProviderInstance(providerInstance, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
