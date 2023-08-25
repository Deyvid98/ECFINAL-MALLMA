const React = require('react');
const { Link, useParams } = require('react-router-dom');
const {useState} = require('react');
const client = require('../client');

const VerCursoPage = () => {

    let { id } = useParams();
    const [curso, setCurso] = useState({});

    client({
        method: 'GET',
        path: '/api/cursos/' + id
    }).done(response=>setCurso(response.entity))


    return (
        <>
            <h1>Ver Cursos</h1>

            <table>
                <tr>
                    <th>Nombre</th>
                    <td>{curso.nombre}</td>
                </tr>
                <tr>
                    <th>Materia</th>
                    <td>{curso.materia}</td>
                </tr>
                <tr>
                    <th>Descripción</th>
                    <td>{curso.descripcion}</td>
                </tr>
            </table>

            <Link to="/">Volver</Link>
        </>
    )

}

module.exports = VerCursoPage;