package com.facebook.soloader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class a extends e {
    public final boolean X;
    public final File Y;
    public final int Z;
    public c75[] a;
    public final ZipFile b;
    public final uue c;
    public final /* synthetic */ je0 o;

    public a(je0 je0, je0 je02, boolean z) {
        this.o = je0;
        this.b = new ZipFile(je0.e);
        this.c = je02;
        this.X = z;
        this.Y = new File(je0.d.getApplicationInfo().nativeLibraryDir);
        this.Z = je0.g;
    }

    public final c75[] S() {
        c75[] c75Arr = this.a;
        if (c75Arr != null) {
            return c75Arr;
        }
        c75[] o2 = o();
        this.a = o2;
        if (this.X || (this.Z & 1) == 0) {
            return o2;
        }
        for (c75 c75 : o2) {
            ZipEntry zipEntry = c75.o;
            zipEntry.getName();
            File file = this.Y;
            File file2 = new File(file, (String) c75.b);
            try {
                if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                    if (file2.isFile()) {
                        if (file2.length() != zipEntry.getSize()) {
                            file2.toString();
                        }
                    }
                    return this.a;
                }
                continue;
            } catch (IOException e) {
                e.toString();
            }
        }
        c75[] c75Arr2 = new c75[0];
        this.a = c75Arr2;
        return c75Arr2;
    }

    public final void close() {
        this.b.close();
    }

    public final ibe[] m() {
        return S();
    }

    public final void n(File file) {
        be5 be5;
        c75[] S = S();
        byte[] bArr = new byte[32768];
        int length = S.length;
        int i = 0;
        while (i < length) {
            c75 c75 = S[i];
            InputStream inputStream = this.b.getInputStream(c75.o);
            try {
                be5 = new be5(c75, 2, inputStream);
                inputStream = null;
                e.a(be5, bArr, file);
                be5.close();
                i++;
            } catch (Throwable th) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        }
        return;
        throw th;
    }

    public final c75[] o() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap hashMap = new HashMap();
        Pattern compile = Pattern.compile(this.o.f);
        String[] supportedAbis = SysUtil$MarshmallowSysdeps.getSupportedAbis();
        Enumeration<? extends ZipEntry> entries = this.b.entries();
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            Matcher matcher = compile.matcher(zipEntry.getName());
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                int i = 0;
                while (true) {
                    if (i >= supportedAbis.length) {
                        i = -1;
                        break;
                    }
                    String str = supportedAbis[i];
                    if (str != null && group.equals(str)) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    linkedHashSet.add(group);
                    c75 c75 = (c75) hashMap.get(group2);
                    if (c75 == null || i < c75.X) {
                        hashMap.put(group2, new c75(group2, zipEntry, i));
                    }
                }
            }
        }
        String[] strArr = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
        this.c.getClass();
        c75[] c75Arr = (c75[]) hashMap.values().toArray(new c75[hashMap.size()]);
        Arrays.sort(c75Arr);
        return c75Arr;
    }
}
