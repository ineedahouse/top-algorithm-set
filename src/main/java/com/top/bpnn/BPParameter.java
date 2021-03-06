package com.top.bpnn;

import java.io.Serializable;

public class BPParameter implements Serializable {

    //输入层神经元个数
    private int inputLayerNeuronCount = 3;
    //隐含层神经元个数
    private int hiddenLayerNeuronCount = 3;
    //输出层神经元个数
    private int outputLayerNeuronCount = 1;
    //归一化区间
    private double normalizationMin = 0.2;
    private double normalizationMax = 0.8;
    //学习步长
    private double step = 0.05;
    //动量因子
    private double momentumFactor = 0.2;
    //激活函数
    private ActivationFunction activationFunction = new Sigmoid();
    //精度
    private double precision = 0.000001;
    //最大循环次数
    private int maxTimes = 1000000;

    public double getMomentumFactor() {
        return momentumFactor;
    }

    public void setMomentumFactor(double momentumFactor) {
        this.momentumFactor = momentumFactor;
    }

    public double getStep() {
        return step;
    }

    public void setStep(double step) {
        this.step = step;
    }

    public double getNormalizationMin() {
        return normalizationMin;
    }

    public void setNormalizationMin(double normalizationMin) {
        this.normalizationMin = normalizationMin;
    }

    public double getNormalizationMax() {
        return normalizationMax;
    }

    public void setNormalizationMax(double normalizationMax) {
        this.normalizationMax = normalizationMax;
    }

    public int getInputLayerNeuronCount() {
        return inputLayerNeuronCount;
    }

    public void setInputLayerNeuronCount(int inputLayerNeuronCount) {
        this.inputLayerNeuronCount = inputLayerNeuronCount;
    }

    public int getHiddenLayerNeuronCount() {
        return hiddenLayerNeuronCount;
    }

    public void setHiddenLayerNeuronCount(int hiddenLayerNeuronCount) {
        this.hiddenLayerNeuronCount = hiddenLayerNeuronCount;
    }

    public int getOutputLayerNeuronCount() {
        return outputLayerNeuronCount;
    }

    public void setOutputLayerNeuronCount(int outputLayerNeuronCount) {
        this.outputLayerNeuronCount = outputLayerNeuronCount;
    }

    public ActivationFunction getActivationFunction() {
        return activationFunction;
    }

    public void setActivationFunction(ActivationFunction activationFunction) {
        this.activationFunction = activationFunction;
    }

    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        this.precision = precision;
    }

    public int getMaxTimes() {
        return maxTimes;
    }

    public void setMaxTimes(int maxTimes) {
        this.maxTimes = maxTimes;
    }
}
