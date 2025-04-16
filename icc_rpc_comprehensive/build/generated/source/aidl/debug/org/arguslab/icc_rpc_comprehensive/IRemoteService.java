/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\Users\\Admin\\Desktop\\Enhanced_benchmark\\ICC-Bench-master\\icc_rpc_comprehensive\\src\\main\\aidl\\org\\arguslab\\icc_rpc_comprehensive\\IRemoteService.aidl
 */
package org.arguslab.icc_rpc_comprehensive;
// Declare any non-default types here with import statements

public interface IRemoteService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.arguslab.icc_rpc_comprehensive.IRemoteService
{
private static final java.lang.String DESCRIPTOR = "org.arguslab.icc_rpc_comprehensive.IRemoteService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.arguslab.icc_rpc_comprehensive.IRemoteService interface,
 * generating a proxy if needed.
 */
public static org.arguslab.icc_rpc_comprehensive.IRemoteService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.arguslab.icc_rpc_comprehensive.IRemoteService))) {
return ((org.arguslab.icc_rpc_comprehensive.IRemoteService)iin);
}
return new org.arguslab.icc_rpc_comprehensive.IRemoteService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_setImei:
{
data.enforceInterface(DESCRIPTOR);
this.setImei();
reply.writeNoException();
return true;
}
case TRANSACTION_getImei:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getImei();
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.arguslab.icc_rpc_comprehensive.IRemoteService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void setImei() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_setImei, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String getImei() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getImei, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_setImei = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getImei = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void setImei() throws android.os.RemoteException;
public java.lang.String getImei() throws android.os.RemoteException;
}
