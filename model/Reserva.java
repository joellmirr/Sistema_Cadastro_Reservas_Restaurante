/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author joelmir
 */
public class Reserva {
    private String idreserva;
    private int mesa;
    private String datareserva;
    private String periodo;
    private int qtdpessoas;
    private int cliente;

    public String getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(String idreserva) {
        this.idreserva = idreserva;
    }

    public String getDatareserva() {
        return datareserva;
    }

    public void setDatareserva(String datareserva) {
        this.datareserva = datareserva;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

   
    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public int getQtdpessoas() {
        return qtdpessoas;
    }

    public void setQtdpessoas(int qtdpessoas) {
        this.qtdpessoas = qtdpessoas;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }


}
