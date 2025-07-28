package ru.ok.android.externcalls.sdk.api.extern;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/api/extern/ExternErrorParser;", "", "Lxwb;", "log", "<init>", "(Lxwb;)V", "Lru/ok/android/api/core/ApiInvocationException;", "exception", "", "parseErrorCode", "(Lru/ok/android/api/core/ApiInvocationException;)I", "", "parseExtendedError", "(Lru/ok/android/api/core/ApiInvocationException;)Ljava/lang/String;", "Lru/ok/android/externcalls/sdk/api/extern/ExternErrorParser$ErrorDescription;", "parse", "(Lru/ok/android/api/core/ApiInvocationException;)Lru/ok/android/externcalls/sdk/api/extern/ExternErrorParser$ErrorDescription;", "Lxwb;", "Companion", "ErrorDescription", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class ExternErrorParser {
    private static final Companion Companion = new Companion((x54) null);
    private static final String LOG_TAG = "ExternErrorParser";
    private final xwb log;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/api/extern/ExternErrorParser$Companion;", "", "()V", "LOG_TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(x54 x54) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/api/extern/ExternErrorParser$ErrorDescription;", "", "errorCode", "", "extendedError", "", "(ILjava/lang/String;)V", "getErrorCode", "()I", "getExtendedError", "()Ljava/lang/String;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ErrorDescription {
        private final int errorCode;
        private final String extendedError;

        public ErrorDescription(int i, String str) {
            this.errorCode = i;
            this.extendedError = str;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final String getExtendedError() {
            return this.extendedError;
        }
    }

    public ExternErrorParser(xwb xwb) {
        this.log = xwb;
    }

    private final int parseErrorCode(ApiInvocationException apiInvocationException) {
        List list;
        List list2;
        try {
            String str = apiInvocationException.b;
            if (str == null) {
                return 0;
            }
            Pattern compile = Pattern.compile(" : ");
            h0e.n0(0);
            Matcher matcher = compile.matcher(str);
            if (!matcher.find()) {
                list = Collections.singletonList(str.toString());
            } else {
                ArrayList arrayList = new ArrayList(10);
                int i = 0;
                do {
                    arrayList.add(str.subSequence(i, matcher.start()).toString());
                    i = matcher.end();
                } while (matcher.find());
                arrayList.add(str.subSequence(i, str.length()).toString());
                list = arrayList;
            }
            if (!list.isEmpty()) {
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            list2 = o23.n0(list, listIterator.nextIndex() + 1);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            list2 = hw4.a;
            String[] strArr = (String[]) list2.toArray(new String[0]);
            if (strArr.length < 2 || TextUtils.isEmpty(strArr[1])) {
                return 0;
            }
            return Integer.parseInt(strArr[1]);
        } catch (NumberFormatException e) {
            this.log.reportException(LOG_TAG, "errorcode.parse.failed", e);
            return 0;
        }
    }

    private final String parseExtendedError(ApiInvocationException apiInvocationException) {
        try {
            String str = apiInvocationException.Y;
            JSONObject jSONObject = str != null ? new JSONObject(str) : null;
            if (jSONObject != null) {
                return jSONObject.getString("extended_code");
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final ErrorDescription parse(ApiInvocationException apiInvocationException) {
        return new ErrorDescription(parseErrorCode(apiInvocationException), parseExtendedError(apiInvocationException));
    }
}
