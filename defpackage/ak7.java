package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: ak7  reason: default package */
public final class ak7 extends jk7 implements wie {
    public static final String[] d = {"_id", "_data"};
    public static final String[] e = {"_data"};
    public static final Rect f = new Rect(0, 0, 512, 384);
    public static final Rect g = new Rect(0, 0, 96, 96);
    public final ContentResolver c;

    public ak7(Executor executor, qe4 qe4, ContentResolver contentResolver) {
        super(executor, qe4);
        this.c = contentResolver;
    }

    public final boolean b(hbc hbc) {
        Rect rect = f;
        return vx3.A(rect.width(), rect.height(), hbc);
    }

    public final ax4 d(tr6 tr6) {
        hbc hbc;
        Cursor query;
        ax4 f2;
        String string;
        int i;
        Uri uri = tr6.b;
        if (!fye.d(uri) || (hbc = tr6.i) == null || (query = this.c.query(uri, d, (String) null, (String[]) null, (String) null)) == null) {
            return null;
        }
        try {
            if (!query.moveToFirst() || (f2 = f(hbc, query.getLong(query.getColumnIndex("_id")))) == null) {
                query.close();
                return null;
            }
            int columnIndex = query.getColumnIndex("_data");
            if (columnIndex >= 0) {
                string = query.getString(columnIndex);
                if (string != null) {
                    i = d8.q(new ExifInterface(string).getAttributeInt("Orientation", 1));
                    f2.o = i;
                }
                i = 0;
                f2.o = i;
            }
            query.close();
            return f2;
        } catch (IOException e2) {
            Class<ak7> cls = ak7.class;
            if (m75.a.i(6)) {
                m75.a.e(cls.getSimpleName(), "Unable to retrieve thumbnail rotation for ".concat(string), e2);
            }
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    public final String e() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    public final ax4 f(hbc hbc, long j) {
        int i;
        Cursor queryMiniThumbnail;
        int columnIndex;
        Rect rect = g;
        if (vx3.A(rect.width(), rect.height(), hbc)) {
            i = 3;
        } else {
            Rect rect2 = f;
            i = vx3.A(rect2.width(), rect2.height(), hbc) ? 1 : 0;
        }
        if (i == 0 || (queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.c, j, i, e)) == null) {
            return null;
        }
        try {
            if (queryMiniThumbnail.moveToFirst() && (columnIndex = queryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String string = queryMiniThumbnail.getString(columnIndex);
                string.getClass();
                if (new File(string).exists()) {
                    return c(new FileInputStream(string), (int) new File(string).length());
                }
            }
            queryMiniThumbnail.close();
            return null;
        } finally {
            queryMiniThumbnail.close();
        }
    }
}
