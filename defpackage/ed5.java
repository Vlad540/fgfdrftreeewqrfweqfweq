package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: ed5  reason: default package */
public final class ed5 {
    public final xb4 a = new xb4(3);
    public final mb5 b;
    public final t52 c;
    public final to8 d;
    public final zxe e;
    public final ft8 f;
    public final j3f g;
    public final gd5 h;
    public final fd5 i;
    public final dd5 j;

    public ed5(mb5 mb5, u74 u74, t52 t52, to8 to8, zxe zxe, ft8 ft8, j3f j3f, gd5 gd5, fd5 fd5, dd5 dd5) {
        this.b = mb5;
        this.c = t52;
        this.d = to8;
        this.e = zxe;
        this.f = ft8;
        this.g = j3f;
        this.h = gd5;
        this.i = fd5;
        this.j = dd5;
    }

    public final List a(File file, xv0 xv0, gvf gvf) {
        xv0 xv02;
        vbe vbe;
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file2 : listFiles) {
            xv0 xv03 = xv0.Y;
            if (xv0 != null) {
                xv02 = xv0;
            } else {
                gd5 gd5 = this.h;
                gd5.getClass();
                String absolutePath = file2.getAbsolutePath();
                File file3 = gd5.d;
                bf5 bf5 = gd5.a;
                if (file3 == null) {
                    gd5.d = ((mg5) bf5).m();
                }
                if (absolutePath.startsWith(gd5.d.getAbsolutePath())) {
                    xv02 = xv0.b;
                } else {
                    String absolutePath2 = file2.getAbsolutePath();
                    if (gd5.e == null) {
                        mg5 mg5 = (mg5) bf5;
                        mg5.getClass();
                        gd5.e = mg5.g(mg5.b(), "audioCache");
                    }
                    if (absolutePath2.startsWith(gd5.e.getAbsolutePath())) {
                        xv02 = xv0.c;
                    } else {
                        String absolutePath3 = file2.getAbsolutePath();
                        if (gd5.f == null) {
                            mg5 mg52 = (mg5) bf5;
                            mg52.getClass();
                            gd5.f = mg5.g(mg52.b(), "stickerCache");
                        }
                        if (absolutePath3.startsWith(gd5.f.getAbsolutePath())) {
                            xv02 = xv0.X;
                        } else {
                            String absolutePath4 = file2.getAbsolutePath();
                            if (gd5.g == null) {
                                mg5 mg53 = (mg5) bf5;
                                mg53.getClass();
                                gd5.g = mg5.g(mg53.b(), "gifCache");
                            }
                            if (absolutePath4.startsWith(gd5.g.getAbsolutePath())) {
                                xv02 = xv0.o;
                            } else {
                                String absolutePath5 = file2.getAbsolutePath();
                                if (gd5.c == null) {
                                    mg5 mg54 = (mg5) bf5;
                                    mg54.getClass();
                                    gd5.c = mg5.g(mg54.b(), "upload");
                                }
                                String absolutePath6 = gd5.c.getAbsolutePath();
                                if (!absolutePath5.startsWith(absolutePath6) || (!absolutePath5.startsWith(File.separator, absolutePath6.length()) && absolutePath5.length() != absolutePath6.length())) {
                                    String absolutePath7 = file2.getAbsolutePath();
                                    if (gd5.h == null) {
                                        mg5 mg55 = (mg5) bf5;
                                        mg55.getClass();
                                        gd5.h = mg5.g(mg55.b(), "exo_files_cache");
                                    }
                                    if (absolutePath7.startsWith(gd5.h.getAbsolutePath())) {
                                        xv02 = xv0.Z;
                                    } else {
                                        String absolutePath8 = file2.getAbsolutePath();
                                        if (gd5.i == null) {
                                            mg5 mg56 = (mg5) bf5;
                                            mg56.getClass();
                                            gd5.i = mg5.g(mg56.b(), "videoCache");
                                        }
                                        xv02 = absolutePath8.startsWith(gd5.i.getAbsolutePath()) ? xv0.w0 : xv0.x0;
                                    }
                                } else {
                                    xv02 = xv03;
                                }
                            }
                        }
                    }
                }
            }
            if (file2.isDirectory()) {
                arrayList.addAll(a(file2, xv02, gvf));
            } else {
                if (xv02 == xv03 && (vbe = (vbe) gvf.b) != null) {
                    Iterator it = ((HashSet) vbe.a).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((File) it.next()).equals(file2)) {
                                udd.p("vbe", "canBeRemoved: skip file: %s", new Object[]{file2});
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                arrayList.add(new jv0(file2, xv02));
            }
        }
        return arrayList;
    }
}
