const React = require('react');
const {useState, useEffect} = require('react');
const { Link, useParams } = require('react-router-dom');
const client = require('../client');

const EditarCursoPage = ()=>{

    const [curso, setCurso]=useState({})
    let {id}=useParams();

    const handleSubmit = (evento)=>{
        evento.preventDefault();
        client({
            method:'PATCH',
            path:'/api/cursos/'+id,
            entity: curso,
            Headers: {'Content-Type': 'application/json'}
        })
    }


    return(
        <>
            <h1>Editar Curso</h1>

            <form onSubmit={handleSubmit}>
                <label>Nombre</label>
                <input type="text" id="nombre" name="nombre" /> <br/>
                <label>Materia</label>
                <input type="text" id="materia" name="materia" /> <br/>
                <label>Descripcion</label>
                <input type="text" id="descripcion" name="descripcion" /> <br/>

                <input type="submit" value="Editar Curso"/>
            </form>
        </>
    )
}
module.exports = EditarCursoPage;