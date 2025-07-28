package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;

/* renamed from: zd  reason: default package */
public final class zd implements knc {
    public final Context b;
    public final cla c;
    public final String d = "MAX";
    public final ka7 e;
    public final r7e f;

    public zd(Context context, cla cla, ka7 ka7) {
        this.b = context;
        this.c = cla;
        this.e = ka7;
        this.f = new r7e(new c6(5, this));
    }

    public final Uri c(lnc lnc, String str) {
        String d2 = lnc.d();
        int a = lnc.a();
        long currentTimeMillis = System.currentTimeMillis();
        File file = new File(d2, this.d);
        wia wia = new wia("_display_name", str);
        wia wia2 = new wia("mime_type", us8.f(a));
        wia wia3 = new wia("date_added", Long.valueOf(currentTimeMillis));
        wia wia4 = new wia("date_modified", Long.valueOf(currentTimeMillis));
        String str2 = File.separator;
        wia[] wiaArr = {wia, wia2, wia3, wia4, new wia("relative_path", file + str2)};
        ContentValues contentValues = new ContentValues(5);
        for (int i = 0; i < 5; i++) {
            wia wia5 = wiaArr[i];
            String str3 = (String) wia5.a;
            Object obj = wia5.b;
            if (obj == null) {
                contentValues.putNull(str3);
            } else if (obj instanceof String) {
                contentValues.put(str3, (String) obj);
            } else if (obj instanceof Integer) {
                contentValues.put(str3, (Integer) obj);
            } else if (obj instanceof Long) {
                contentValues.put(str3, (Long) obj);
            } else if (obj instanceof Boolean) {
                contentValues.put(str3, (Boolean) obj);
            } else if (obj instanceof Float) {
                contentValues.put(str3, (Float) obj);
            } else if (obj instanceof Double) {
                contentValues.put(str3, (Double) obj);
            } else if (obj instanceof byte[]) {
                contentValues.put(str3, (byte[]) obj);
            } else if (obj instanceof Byte) {
                contentValues.put(str3, (Byte) obj);
            } else if (obj instanceof Short) {
                contentValues.put(str3, (Short) obj);
            } else {
                String canonicalName = obj.getClass().getCanonicalName();
                throw new IllegalArgumentException("Illegal value type " + canonicalName + " for key \"" + str3 + '\"');
            }
        }
        Integer e2 = lnc.e();
        if (e2 != null) {
            contentValues.put("_size", Integer.valueOf(e2.intValue()));
        }
        Integer width = lnc.getWidth();
        if (width != null) {
            contentValues.put("width", Integer.valueOf(width.intValue()));
        }
        Integer height = lnc.getHeight();
        if (height != null) {
            contentValues.put("height", Integer.valueOf(height.intValue()));
        }
        contentValues.put("is_pending", 1);
        r7e r7e = this.f;
        Uri insert = ((ContentResolver) r7e.getValue()).insert(lnc.c(), contentValues);
        if (insert == null) {
            return null;
        }
        lnc.b((ContentResolver) r7e.getValue(), insert);
        contentValues.clear();
        contentValues.put("is_pending", 0);
        ((ContentResolver) r7e.getValue()).update(insert, contentValues, (String) null, (String[]) null);
        Context context = this.b;
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(insert);
        intent.addFlags(1);
        try {
            context.sendBroadcast(intent);
        } catch (Exception e3) {
            jnc jnc = jnc.a;
            String str4 = jnc.b;
            udd.s(str4, "sendBroadcastToGallery: failed for uri " + insert, e3);
        }
        return insert;
    }
}
