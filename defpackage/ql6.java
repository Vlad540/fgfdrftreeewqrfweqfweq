package defpackage;

import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.cookie.SM;
import org.apache.http.protocol.HTTP;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.http.HttpStatusApiException;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonSyntaxException;

/* renamed from: ql6  reason: default package */
public final class ql6 implements vk {
    public final qr4 a;
    public final fq3 b = new fq3(2);
    public final lk9 c = lk9.X;
    public final xhd d = it3.a;
    public hl e = hl.a;

    public ql6(qr4 qr4) {
        this.a = qr4;
    }

    public final Object a(yk ykVar, wk wkVar) {
        int i;
        String str;
        hm6 hm6;
        hm6 hm62;
        lk9 lk9 = this.c;
        try {
            this.e.debugApiRequest(this, ykVar, wkVar);
            stf b2 = b(ykVar, wkVar);
            ds dsVar = (ds) b2.c;
            this.a.getClass();
            om6 n = qr4.n(b2);
            ds dsVar2 = (ds) n.c;
            int i2 = n.b;
            if (i2 == 200) {
                try {
                    sz5 sz5 = n.o;
                    sz5.getClass();
                    n67 a2 = n67.a(new BufferedInputStream(((HttpURLConnection) sz5.b).getInputStream()));
                    if (dsVar2.a(SM.SET_COOKIE)) {
                        xhd xhd = this.d;
                        it3.a(dsVar2);
                        xhd.getClass();
                    }
                    if (dsVar2.a("Invocation-Error") || dsVar2.a("WMF-Invocation-Error")) {
                        throw ((Throwable) ykVar.getFailParser().parse(this.e.debugApiResponseFail(this, ykVar, a2)));
                    }
                    i = 0;
                    str = null;
                    Object parse = ykVar.getOkParser().parse(this.e.debugApiResponseOk(this, ykVar, a2));
                    hm6[] hm6Arr = (hm6[]) dsVar.b;
                    int length = hm6Arr.length;
                    while (true) {
                        if (i >= length) {
                            hm62 = null;
                            break;
                        }
                        hm62 = hm6Arr[i];
                        if (p0e.M(hm62.a, "Geo-Position", true)) {
                            break;
                        }
                        i++;
                    }
                    if ((hm62 != null ? hm62.b : null) != null) {
                        lk9.getClass();
                    }
                    urd.l(n, (Throwable) null);
                    return parse;
                } catch (JsonSyntaxException e2) {
                    throw new Exception(e2);
                } catch (JsonParseException e3) {
                    throw new Exception(e3);
                } catch (JsonSyntaxException e4) {
                    throw new Exception(e4);
                } catch (JsonParseException e5) {
                    throw new Exception(e5);
                } catch (Throwable th) {
                    urd.l(n, th);
                    throw th;
                }
            } else {
                throw new HttpStatusApiException(i2);
            }
        } catch (ApiException e6) {
            this.e.debugApiException(this, ykVar, e6);
            throw e6;
        } catch (IOException e7) {
            this.e.debugIoException(this, ykVar, e7);
            throw e7;
        }
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.Object, i6g] */
    public final stf b(fl flVar, wk wkVar) {
        String str;
        Object obj;
        String str2;
        ArrayList arrayList = new ArrayList();
        flVar.getPriority();
        boolean shouldPost = flVar.shouldPost();
        int i = 1;
        fq3 fq3 = this.b;
        if (shouldPost) {
            str2 = fq3.a(flVar).toString();
            arrayList.add(new hm6(HTTP.CONTENT_TYPE, URLEncodedUtils.CONTENT_TYPE));
            if (flVar.shouldGzip()) {
                arrayList.add(new hm6(HTTP.CONTENT_ENCODING, "gzip"));
            }
            if (str2.equals("https") || p0e.Q(str2, "https:", false)) {
                i = 2;
            }
            ? obj2 = new Object();
            obj2.o = this;
            obj2.a = flVar;
            obj2.c = wkVar;
            obj2.b = i;
            str = HttpPost.METHOD_NAME;
            obj = obj2;
        } else {
            str2 = fq3.a(flVar).toString();
            int i2 = 3;
            if (sl6.$EnumSwitchMapping$0[hr1.t(3)] == 1) {
                if (str2.equals("https") || p0e.Q(str2, "https:", false)) {
                    i = 2;
                }
                i2 = i;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            fq3.c(byteArrayOutputStream, flVar, wkVar, i2);
            if (byteArrayOutputStream.size() != 0) {
                StringBuilder n = me4.n(str2, h0e.Z(str2, '?', 0, false, 6) < 0 ? "?" : "&");
                n.append(byteArrayOutputStream.toString("UTF-8"));
                str2 = n.toString();
            }
            obj = null;
            str = HttpGet.METHOD_NAME;
        }
        if (flVar instanceof wj0) {
            String str3 = ((wj0) flVar).a;
            if (str3 != null) {
                "batch.executeV2-".concat(str3);
            }
        } else {
            Uri uri = flVar.getUri();
            if (!hhd.f(uri.getScheme(), "ok") || !hhd.f(uri.getAuthority(), "api")) {
                uri.getPath();
            } else {
                sl.b(uri);
            }
        }
        if (hhd.f(flVar.getUri().getAuthority(), "api")) {
            this.c.getClass();
            this.d.getClass();
        }
        arrayList.add(new hm6("Accept", "application/json"));
        if (str2 != null) {
            return new stf(str, str2, new ds(1, (hm6[]) arrayList.toArray(new hm6[0])), obj);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
