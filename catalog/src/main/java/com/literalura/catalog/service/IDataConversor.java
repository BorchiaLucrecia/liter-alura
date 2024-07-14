package com.literalura.catalog.service;

public interface IDataConversor {
    <T> T convertData(String json, Class<T> clase);
}
